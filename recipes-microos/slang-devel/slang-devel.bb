SUMMARY = "Programming Library and Embeddable Extension Language - Development Package"
DESCRIPTION = "S-Lang is a programming library for creating multi-platform software. \
It provides display/screen management, keyboard input, keymaps, etc. \
Another feature is the interpreter for the S-Lang extension language \
which can be embedded into an application to make it extensible. With \
slsh, a standalone interpreter is available as well. \
 \
This package contains all necessary include files and libraries needed to \
develop applications that require it."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.3"

RPM_NAME = "slang-devel-2.3.3-1.3.aarch64.rpm"
RPM_HASH = "9cf4440dab0be0dda16716561da00ae039cc61619f6adfad616d62e2304cc4b92f32c7ca2fe5ab050cc317c36931bc393bd235e82f00a1b2a941f88070a4fbe5"

RPROVIDES:${PN} += "pkgconfig(slang) \
slang-devel \
slang-devel(aarch-64) \
slang:/usr/include/slang.h"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libslang2"

inherit rpm
