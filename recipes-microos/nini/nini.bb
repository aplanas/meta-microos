SUMMARY = "An uncommonly powerful .NET configuration library"
DESCRIPTION = "Nini is an uncommonly powerful .NET configuration library designed to \
help build highly configurable applications quickly."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "nini-1.1.0-14.17.noarch.rpm"
RPM_HASH = "7a1b92f8522227ad18ff5f82f6a1d3f81dab1c63aab3ebe629bff3dd34a379977e87a83b37f989f06ce87f7a7564324f1c00584d05dff9f627b8a5beb8e1bd67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono(Nini) nini pkgconfig(nini-1.1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config mono(System) mono(System.Xml) mono(mscorlib)"

inherit rpm
