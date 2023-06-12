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

RPM_NAME = "python310-statsmodels-0.13.5-2.5.aarch64.rpm"
RPM_HASH = "20a7eafdb21007fdf7f74d38519836800ee2f4352c5288adff02a6a0dbed5a8beb5916728389baa275fe290f76a8895b2305a993889c974a8ee55b9a227c3392"

RPROVIDES:${PN} += "python3-statsmodels \
python3.10dist(statsmodels) \
python310-statsmodels \
python310-statsmodels(aarch-64) \
python3dist(statsmodels)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python310-numpy \
python310-pandas \
python310-patsy \
python310-scipy"

inherit rpm
