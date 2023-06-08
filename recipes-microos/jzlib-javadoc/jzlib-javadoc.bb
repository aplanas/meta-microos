SUMMARY = "API documentation for jzlib"
DESCRIPTION = "API documentation for jzlib."
LICENSE = "BSD-3-Clause"

PV = "1.1.3"

RPM_NAME = "jzlib-javadoc-1.1.3-5.6.noarch.rpm"
RPM_HASH = "5209cff3132966b8f965b254b4d90c26e12e8fd0a21c0d4667f3f747f9436ac3e1db6b1d35f98286aa996aa32c4f0f228c60c764cc144c7c256b4f4681d29c6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jzlib-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
