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

RPM_NAME = "python311-statsmodels-0.13.5-2.5.aarch64.rpm"
RPM_HASH = "e42609927b79b2adfd832314456088bcf5fe8f60ec93998e9879dbacc82a3c6187a7c1f805af3be0f31132a9b960d741e2138eac6713d81173baa7a74352be0c"

RPROVIDES:${PN} += "python3.11dist(statsmodels) python311-statsmodels python311-statsmodels(aarch-64) python3dist(statsmodels)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python311-numpy python311-pandas python311-patsy python311-scipy"

inherit rpm
