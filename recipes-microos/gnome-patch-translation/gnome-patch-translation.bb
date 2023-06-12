SUMMARY = "Collect and Merge Translations From RPM Patches"
DESCRIPTION = "This package provides scripts for collecting strings changed in RPM \
patches and merging them to one translation compendium."
LICENSE = "GPL-2.0-or-later"

PV = "15.0"

RPM_NAME = "gnome-patch-translation-15.0-3.5.noarch.rpm"
RPM_HASH = "48b5f6a881c07919157a4506bb90eca4551bcc139a9d1be53256b2032691e7a3cc9f087d9c67f6dd833f09d7c0ff750834b80530d2921ef5db552a31cd28f4b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-patch-translation"
RDEPENDS:${PN} += "/bin/bash \
intltool"

inherit rpm
