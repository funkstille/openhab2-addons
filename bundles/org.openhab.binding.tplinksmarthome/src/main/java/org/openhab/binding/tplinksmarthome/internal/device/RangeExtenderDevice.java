/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.tplinksmarthome.internal.device;

import java.io.IOException;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.smarthome.core.library.types.OnOffType;
import org.eclipse.smarthome.core.types.State;
import org.openhab.binding.tplinksmarthome.internal.Connection;
import org.openhab.binding.tplinksmarthome.internal.model.SetRelayState;

/**
 * TP-Link Smart Home range extender with smart plug.
 *
 * @author Hilbrand Bouwkamp - Initial contribution
 */
@NonNullByDefault
public class RangeExtenderDevice extends SwitchDevice {

    @Override
    protected State getOnOffState(DeviceState deviceState) {
        return deviceState.getSysinfo().getPlug().getRelayStatus();
    }

    @Override
    protected @Nullable SetRelayState setOnOffState(@NonNull Connection connection, @NonNull OnOffType onOff)
            throws IOException {
        // It's unknown what the command is to send to the device so it's not supported.
        return null;
    }
}
