SUMMARY = "Javadoc for laf-plugin"
DESCRIPTION = "The goal of this project is to provide a small infrastructure that \
provides plugin mechanism for third-party components in look-and-feel \
libraries. \
 \
This package provides the Java (HTML) Documentation for laf-plugin."
LICENSE = "BSD-3-Clause & Zlib"

PV = "1.0"

RPM_NAME = "laf-plugin-javadoc-1.0-7.6.noarch.rpm"
RPM_HASH = "bd889b7fa730abfd33152210b9c6dbe96cc5b870ee94e78463a36eed03ae0f9b2a1f0bf142882ec7c5f6677a3cb4c46939dad3d6ae5e5b6e2fce4c4f929c211c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "laf-plugin-javadoc"
RDEPENDS:${PN} += ""

inherit rpm
