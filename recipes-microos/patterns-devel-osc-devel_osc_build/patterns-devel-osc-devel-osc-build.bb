SUMMARY = "Tools for Packaging with Open Build Service"
DESCRIPTION = "Tools for checkouting, patching, building and testing package via osc."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-osc-devel_osc_build-20170319-3.16.aarch64.rpm"
RPM_HASH = "43c37f607ff5d017dbaae8a38c62b3d2b3ff60e699ac96e8b760df606de40395d5f116920d6365c43cb3d9b3bb2e29461fac79bd12346f7caf21724d466ef149"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-devel-osc-devel_osc_build \
patterns-devel-osc-devel_osc_build(aarch-64)"
RDEPENDS:${PN} += "osc \
pattern()"

inherit rpm
