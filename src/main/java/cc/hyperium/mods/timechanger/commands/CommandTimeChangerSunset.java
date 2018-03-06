/*
 *  Hypixel Community Client, Client optimized for Hypixel Network
 *     Copyright (C) 2018  Hyperium Dev Team
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as published
 *     by the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package cc.hyperium.mods.timechanger.commands;

import cc.hyperium.commands.BaseCommand;
import cc.hyperium.commands.CommandException;
import cc.hyperium.handlers.handlers.chat.GeneralChatHandler;
import cc.hyperium.mods.timechanger.TimeChanger;
import cc.hyperium.mods.timechanger.TimeChanger.TimeType;
import cc.hyperium.utils.ChatColor;

public class CommandTimeChangerSunset implements BaseCommand {
    
    private final TimeChanger mod;
    
    public CommandTimeChangerSunset(TimeChanger main) {
        this.mod = main;
    }
    
    @Override
    public String getName() {
        return "sunset";
    }
    
    @Override
    public String getUsage() {
        return ChatColor.RED + "Usage: /sunset";
    }
    
    @Override
    public void onExecute(String[] args) throws CommandException {
        this.mod.setTimeType(TimeType.SUNSET);
        GeneralChatHandler.instance().sendMessage(ChatColor.RED + "[TimeChanger] " + ChatColor.GREEN + "Time set to sunset.", false);
    }
}