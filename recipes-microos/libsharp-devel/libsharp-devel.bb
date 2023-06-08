SUMMARY = "Headers and devel files for libsharp"
DESCRIPTION = "libsharp is a code library for spherical harmonic transforms (SHTs). \
 \
This package provides the headers and devel files for developing applications \
against libsharp."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "libsharp-devel-1.0.0-1.11.aarch64.rpm"
RPM_HASH = "a9ca6f2c6b7295c2475acc6b8be4d0a6e3a30eef8abeb417c7b838b609b159cfbd7dd12c14048bbada9a83aa18c0d6f1c1ca13f6a0f2e526be0326126c34047f"

RPROVIDES:${PN} += "libsharp-devel libsharp-devel(aarch-64) pkgconfig(libsharp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libsharp0"

inherit rpm
