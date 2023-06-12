SUMMARY = "Rust/Python Interoperability"
DESCRIPTION = "Build and publish crates with pyo3, rust-cpython and cffi bindings \
as well as rust binaries as python packages. \
 \
This project is a zero-configuration replacement for \
setuptools-rust milksnake. It supports building wheels for Python \
3.6+, can upload them to PyPI and has basic PyPy support."
LICENSE = "Apache-2.0 | MIT"

PV = "1.0.1"

RPM_NAME = "python39-maturin-1.0.1-1.1.aarch64.rpm"
RPM_HASH = "5a8607e2e5c8dbccd5f60ac2e33f721e6f1a241c242856500372129aeb72b202a1e1add038c66792975184235c886825d129c36c97840c58cfb1da30a33dc274"

RPROVIDES:${PN} += "python3.9dist(maturin) python39-maturin python39-maturin(aarch-64) python3dist(maturin)"
RDEPENDS:${PN} += "/bin/sh libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) python(abi) python39-tomli update-alternatives"

inherit rpm
