SUMMARY = "Lightweight Lua IDE"
DESCRIPTION = "ZeroBrane Studio is a lightweight cross-platform Lua IDE with code completion, \
syntax highlighting, remote debugger, code analyzer, live coding, and debugging \
support for several Lua engines (LuaJIT, Love 2D, Moai, Gideros, Corona, \
Marmalade Quick, Cocos2d-x, GSL-shell, Adobe Lightroom, OpenResty/Nginx and \
others). It originated from the Estrela Editor."
LICENSE = "MIT"

PV = "1.90"

RPM_NAME = "zerobranestudio-1.90-3.6.noarch.rpm"
RPM_HASH = "eb8790795d2aeeec01edbc0428f7f3a05e81e716ebc654699ccf14c67cb9facf3896fa3478745a4be6718d05aef2253e8e159b85e14bc648883877f1d701b1c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(zbstudio.desktop) metainfo() metainfo(zbstudio.appdata.xml) mimehandler(application/lua) mimehandler(application/x-lua) mimehandler(text/x-lua) zbstudio zerobrane-studio zerobranestudio"
RDEPENDS:${PN} += "/bin/bash Lua(API) libwxlua lua-copas lua-lpeg lua-luafilesystem lua-luasec luasocket"

inherit rpm
