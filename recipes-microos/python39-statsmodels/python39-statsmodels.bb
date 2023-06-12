SUMMARY = "A Python module that allows users to explore data"
DESCRIPTION = "Statsmodels is a Python module that allows users to explore data, \
estimate statistical models, and perform statistical tests. \
An extensive list of descriptive statistics, statistical tests, \
plotting functions, and result statistics are available for different \
types of data and each estimator. Researchers across fields may find \
that statsmodels fully meets their needs for statistical computing \
and data analysis in Python."
LICENSE = "BSD-3-Clause"

PV = "0.13.5"

RPM_NAME = "python39-statsmodels-0.13.5-2.5.aarch64.rpm"
RPM_HASH = "ae450f688a27cc72596f35f845ffff799d1ffde110273e7900b479d185ad96627287c120cb0f9026163e697809ed46ca02d27cc66f4e804223933b1fbcbaf601"

RPROVIDES:${PN} += "python3.9dist(statsmodels) \
python39-statsmodels \
python39-statsmodels(aarch-64) \
python3dist(statsmodels)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python39-numpy \
python39-pandas \
python39-patsy \
python39-scipy"

inherit rpm
