package net.blancworks.figura_entrypoint_example;

import net.blancworks.figura.lua.CustomScript;
import net.blancworks.figura.lua.api.FiguraAPI;
import net.minecraft.util.Identifier;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.ZeroArgFunction;

public class ExampleAPI implements FiguraAPI {
    @Override
    public Identifier getID() {
        return new Identifier("example", "test_api");
    }

    @Override
    public LuaTable getForScript(CustomScript customScript) {
        return new LuaTable() {{
            set("test", new ZeroArgFunction() {
                @Override
                public LuaValue call() {
                    return LuaValue.valueOf("Custom API -> TEST");
                }
            });
        }};
    }
}
