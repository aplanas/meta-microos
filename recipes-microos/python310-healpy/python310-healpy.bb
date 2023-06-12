SUMMARY = "Python library to handle pixelated data on the sphere based on HEALPix"
DESCRIPTION = "healpy is a Python package to handle pixelated data on the sphere. It is based \
on the Hierarchical Equal Area isoLatitude Pixelization (HEALPix) scheme and \
bundles the HEALPix C++ library. \
 \
healpy provides utilities to: \
* convert between sky coordinates and pixel indices in HEALPix nested and ring schemes \
* find pixels within a disk, a polygon or a strip in the sky \
* apply coordinate transformations between Galactic, Ecliptic and Equatorial reference frames \
* apply custom rotations either to vectors or full maps \
* read and write HEALPix maps to disk in FITS format \
* upgrade and downgrade the resolution of existing HEALPix maps \
* visualize maps in Mollweide, Gnomonic and Cartographic projections \
* transform maps to Spherical Harmonics space and back using multi-threaded C++ routines \
* compute Auto and Cross Power Spectra from maps and create map realizations from spectra"
LICENSE = "GPL-2.0-only"

PV = "1.16.2"

RPM_NAME = "python310-healpy-1.16.2-1.1.aarch64.rpm"
RPM_HASH = "1aa117a353de66373cf0a2931dbd29ecb16a6049dfdeaa7a7cad1dadec2f51c7c52845fff8d4d47ee2d60260dd1ba770872b8e3f299713b9a11781a48e27adcf"

RPROVIDES:${PN} += "python3-healpy python3.10dist(healpy) python310-healpy python310-healpy(aarch-64) python3dist(healpy)"
RDEPENDS:${PN} += "/bin/bash /bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libhealpix_cxx.so.3()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) python(abi) python310-astropy python310-matplotlib python310-numpy python310-scipy update-alternatives"

inherit rpm
