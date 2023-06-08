SUMMARY = "Development files for OAML, the Open Adaptive Music library"
DESCRIPTION = "OAML is a library for implementing adaptive music in games. \
This package contains the development files for oaml."
LICENSE = "Apache-2.0"

PV = "1.3.4"

RPM_NAME = "oaml-devel-1.3.4-1.14.aarch64.rpm"
RPM_HASH = "e34575f681b4c4c54f2f53608be3c98b592f307c50cf67ebf6e8aede9e0a6ed211d2d59ccea284bc1cc1a6dbe9b1fc6f4a7f7b4e6f1f96767b303d016b86e69a"

RPROVIDES:${PN} += "oaml-devel oaml-devel(aarch-64) pkgconfig(oaml)"
RDEPENDS:${PN} += "/usr/bin/pkg-config liboaml1 pkgconfig(ogg) pkgconfig(vorbis)"

inherit rpm
