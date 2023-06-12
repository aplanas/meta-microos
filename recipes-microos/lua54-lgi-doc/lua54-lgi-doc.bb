SUMMARY = "Lua bindings to GObject libraries - documentation and samples"
DESCRIPTION = "Dynamic Lua binding to any library which is introspectable \
using gobject-introspection. Allows using GObject-based libraries \
directly from Lua."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "lua54-lgi-doc-0.9.2-4.3.aarch64.rpm"
RPM_HASH = "af029cfb06df8c4ea153f8d6c5889d9cbada1ecc390e807baba0f3bf893acdf86f0dfa13a24233290200a85b0726b030df2461b6f0a2a22a3b3dfd7db5d616c4"

RPROVIDES:${PN} += "lua54-lgi-doc \
lua54-lgi-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
