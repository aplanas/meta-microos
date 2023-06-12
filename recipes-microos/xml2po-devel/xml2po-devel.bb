SUMMARY = "Pkgconfig file for xml2po"
DESCRIPTION = "xml2po is a Python program which extracts translatable content from \
free-form XML documents and outputs gettext compatible POT files."
LICENSE = "GPL-2.0-or-later"

PV = "0.20.10"

RPM_NAME = "xml2po-devel-0.20.10-21.5.noarch.rpm"
RPM_HASH = "5e84f6a5fe21e9666fefc72fc4a1a64afddcb886c331f7fab0858eb99ef1127d438020dc742a246aa01c8d87714597fd6d48cc465ee5e5c0f5b2b6595edbdb41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig(xml2po) \
xml2po-devel"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
xml2po"

inherit rpm
