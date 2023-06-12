SUMMARY = "Translations for package kdesdk-scripts"
DESCRIPTION = "Provides translations for the 'kdesdk-scripts' package."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.1"

RPM_NAME = "kdesdk-scripts-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "5d59f36be44b2ae2a50701018d008a0171374b50aa843d0c4ca4dab3c68288711f731b205ff7ed80b53f5c7521232410fed22c4f11ab0f6317329035c0a43e69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdesdk-scripts-lang \
kdesdk-scripts-lang-all"
RDEPENDS:${PN} += "kdesdk-scripts"

inherit rpm
