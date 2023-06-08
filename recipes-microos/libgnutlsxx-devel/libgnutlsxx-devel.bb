SUMMARY = "Development package for the GnuTLS C++ API"
DESCRIPTION = "Files needed for software development using gnutls."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.0"

RPM_NAME = "libgnutlsxx-devel-3.8.0-1.1.aarch64.rpm"
RPM_HASH = "957c5640cc8536322a880553cf81297c3369e5fa5c83ce368cf22d2d625415028f6c27d509955aa9216e6a4368cc68fc9d6ab3d421cb3dde1a7846427a560124"

RPROVIDES:${PN} += "libgnutlsxx-devel libgnutlsxx-devel(aarch-64)"
RDEPENDS:${PN} += "libgnutls-devel libgnutlsxx30 libstdc++-devel"

inherit rpm
