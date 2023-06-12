SUMMARY = "Translations for libmirage"
DESCRIPTION = "Provides translations for the 'libmirage' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "libmirage-lang-3.2.6-1.8.noarch.rpm"
RPM_HASH = "4779d6d54a874c68051ef468bafc054ecd2ab44fccb70c14b3a2285c7f5d0ef48a3317679541c5678018b13aa80d64f379cb146c65ad33e8a63540d78b38fcbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmirage-lang \
libmirage-lang-all \
locale(libmirage:ru) \
locale(libmirage:sl)"
RDEPENDS:${PN} += ""

inherit rpm
