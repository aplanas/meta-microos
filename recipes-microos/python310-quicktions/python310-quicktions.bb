SUMMARY = "Fast fractions data type for rational numbers"
DESCRIPTION = "Python's Fraction data type is an excellent way to do exact money \
calculations and largely beats Decimal in terms of simplicity, \
accuracy and safety.  Clearly not in terms of speed, though, given \
the cdecimal accelerator in Py3.3+. \
 \
Quicktions is an adaptation of the original fractions module \
(as included in CPython 3.5) that is compiled and optimised with \
Cython into a fast, native extension module. \
 \
Compared to the standard library fractions module in Py2.7 and \
Py3.4, quicktions is currently about 10x faster, and still about \
6x faster than the current version in Python 3.5.  It's also about \
15x faster than the (Python implemented) decimal module in Py2.7."
LICENSE = "Python-2.0"

PV = "1.14"

RPM_NAME = "python310-quicktions-1.14-1.3.aarch64.rpm"
RPM_HASH = "555a5617530a1de54a780705687c6ada3000786e8548bffb74d0a81fbaf38c272b028450f1cf1412e5a3a94265f979e90321a9f2139cf596fede2ce14d82a521"

RPROVIDES:${PN} += "python3-quicktions python3.10dist(quicktions) python310-quicktions python310-quicktions(aarch-64) python3dist(quicktions)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
