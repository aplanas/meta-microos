SUMMARY = "EditorConfig Core support for the Lua language"
DESCRIPTION = "EditorConfig makes it easy to maintain the correct coding \
style when switching between different text editors \
and betweendifferent projects. The EditorConfig project \
maintains a file format and plugins for various text editors \
which allow this file format to be read and used by those \
editors. EditorConfig Lua Core provides the same functionality \
as the Editorconfig C Core library."
LICENSE = "BSD-2-Clause"

PV = "0.3.0"

RPM_NAME = "lua53-editorconfig-core-lua-0.3.0-4.4.aarch64.rpm"
RPM_HASH = "ef8c3bae714b54a08ff2eddf562e4ca5ec841caf2aed7d71d5746ad8d71640e71db1c2dce50b9698a9bc1f32c0e9a308df447e3df01a0fc33162b54547c04915"

RPROVIDES:${PN} += "lua53-LPeg lua53-editorconfig-core-lua lua53-editorconfig-core-lua(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libeditorconfig.so.0()(64bit) lua53"

inherit rpm
