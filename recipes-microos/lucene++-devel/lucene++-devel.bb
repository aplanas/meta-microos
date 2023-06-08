SUMMARY = "Development files for lucene++"
DESCRIPTION = "Development files for lucene++, a high-performance, full-featured text search engine written in C++"
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "3.0.8"

RPM_NAME = "lucene++-devel-3.0.8-4.2.aarch64.rpm"
RPM_HASH = "5fb72cb04d7d0afc1169ebcc12bfdcb90819e4d037c3a34ff013b9c500600c91c7f9a6cf4d1a6129cf20f792cb4c4f1dbf9deda79ba3245f4de841b4258fcefd"

RPROVIDES:${PN} += "cmake(liblucene++) cmake(liblucene++-contrib) lucene++-devel lucene++-devel(aarch-64) pkgconfig(liblucene++) pkgconfig(liblucene++-contrib)"
RDEPENDS:${PN} += "/usr/bin/pkg-config liblucene++0"

inherit rpm
