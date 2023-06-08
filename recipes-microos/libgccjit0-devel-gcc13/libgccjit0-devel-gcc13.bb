SUMMARY = "Support for embedding GCC inside programs and libraries"
DESCRIPTION = "Package contains header files and documentation for GCC JIT front-end."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "libgccjit0-devel-gcc13-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "217b95d1398f0ccdae1784e8ac662bb573fbdc1306477d667b93669128d52586ce1f4667a1ba194997b75dbcce905d8379496e57fc11b792c6b7914630d4f8ee"

RPROVIDES:${PN} += "libgccjit0-devel libgccjit0-devel-gcc13 libgccjit0-devel-gcc13(aarch-64)"
RDEPENDS:${PN} += "libgccjit0"

inherit rpm
