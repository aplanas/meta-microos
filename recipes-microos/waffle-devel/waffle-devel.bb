SUMMARY = "Libraries, includes and more to develop Waffle applications"
DESCRIPTION = "Devel files for the waffle C library. Libraries, includes and more to \
develop Waffle applications."
LICENSE = "BSD-2-Clause"

PV = "1.7.2"

RPM_NAME = "waffle-devel-1.7.2-1.3.aarch64.rpm"
RPM_HASH = "d4aa4b9482711d1ab2a588aa8a479e58df85ad051dac41c7de477a6451cc3a56b80d6dbd7001556cdadb6dc363c914c5f34a3464c3637f560ad836146b4aa722"

RPROVIDES:${PN} += "cmake(Waffle) pkgconfig(waffle-1) waffle-devel waffle-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libwaffle-1-0"

inherit rpm
