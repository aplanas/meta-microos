SUMMARY = "Rust/Python Interoperability"
DESCRIPTION = "Build and publish crates with pyo3, rust-cpython and cffi bindings \
as well as rust binaries as python packages. \
 \
This project is a zero-configuration replacement for \
setuptools-rust milksnake. It supports building wheels for Python \
3.6+, can upload them to PyPI and has basic PyPy support."
LICENSE = "Apache-2.0 | MIT"

PV = "0.15.1"

RPM_NAME = "python39-maturin-0.15.1-1.1.aarch64.rpm"
RPM_HASH = "4c4033f3bf194fb594fbe3d1ae67b37e5b02e504b1095e8097ce10fa4d6d648cb5d3b823d3b66532d0abb45c16e5a3e3316a2036aedff8961f2f98a77c03336c"

RPROVIDES:${PN} += "python3.9dist(maturin) python39-maturin python39-maturin(aarch-64) python3dist(maturin)"
RDEPENDS:${PN} += "/bin/sh libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) python(abi) python39-tomli update-alternatives"

inherit rpm
