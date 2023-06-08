SUMMARY = "Devel and header files for AMR"
DESCRIPTION = "Library of OpenCORE Framework implementation of Adaptive Multi Rate \
Narrowband and Wideband speech codec. \
Developer Package."
LICENSE = "Apache-2.0"

PV = "0.1.6"

RPM_NAME = "libopencore-amr-devel-0.1.6-1.3.aarch64.rpm"
RPM_HASH = "0b93b5f8b4d58d822d96ab65aa18b9c6a607b06468971e8a63872a88e464a3052febb45bb0635116579185f08da7133f54e38d4db4353a8ebbdbdc22a4bb75c7"

RPROVIDES:${PN} += "libopencore-amr-devel libopencore-amr-devel(aarch-64) pkgconfig(opencore-amrnb) pkgconfig(opencore-amrwb)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libopencore-amrnb0 libopencore-amrwb0"

inherit rpm
