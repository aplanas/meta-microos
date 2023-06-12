SUMMARY = "Support for embedding GCC inside programs and libraries"
DESCRIPTION = "Package contains header files and documentation for GCC JIT front-end."
LICENSE = "GPL-3.0-or-later"

PV = "13"

RPM_NAME = "libgccjit-devel-13-1.3.aarch64.rpm"
RPM_HASH = "16dada7263b4ca4302bc83ebb82b43c3992b8503aab41db39231609c1bd858d0b485bd455def403e1988b8ac42350bd50a5ab448547cba642d021bf9901cb7de"

RPROVIDES:${PN} += "libgccjit-devel \
libgccjit-devel(aarch-64)"
RDEPENDS:${PN} += "libgccjit0-devel-gcc13"

inherit rpm
