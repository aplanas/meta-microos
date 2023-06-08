SUMMARY = "Development files for splinter, a multivariate function approximation library"
DESCRIPTION = "SPLINTER (SPLine INTERpolation) is a library for multivariate function \
approximation implemented in C++. The library can be used for function \
approximation, regression and data smoothing. \
 \
This package provides the header files and sources required for \
developing applications with splinter."
LICENSE = "MPL-2.0"

PV = "3.0"

RPM_NAME = "splinter-devel-3.0-2.22.aarch64.rpm"
RPM_HASH = "256914003b9e46aaeff7065c159f7b505bf3f42578e68d844f5b6eddfae01d31e6df7c48bac19cdc87d58484a86532a90487a579ef861953530fe88cbd499bc8"

RPROVIDES:${PN} += "splinter-devel splinter-devel(aarch-64)"
RDEPENDS:${PN} += "libsplinter-3-0"

inherit rpm
