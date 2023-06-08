SUMMARY = "A collection of special mathematical functions"
DESCRIPTION = "Openspecfun provides AMOS and Faddeeva. AMOS (from Netlib) is a portable package \
for Bessel Functions of a Complex Argument and Nonnegative Order; it contains \
subroutines for computing Bessel functions and Airy functions. Faddeeva allows \
computing the various error functions of arbitrary complex arguments (Faddeeva \
function, error function, complementary error function, scaled complementary \
error function, imaginary error function, and Dawson function); given these, \
one can also easily compute Voigt functions, Fresnel integrals, and similar \
related functions as well."
LICENSE = "MIT"

PV = "0.5.5"

RPM_NAME = "libopenspecfun1-0.5.5-1.3.aarch64.rpm"
RPM_HASH = "a09d92cfd9cf6fd40e84f9a8a2ce53998a225aafc30d9425d746a6437ceac1ab44ab0d1f5603cfe72db0488cfd18f02f337c9d29f000c1ec69290e90d04db8d9"

RPROVIDES:${PN} += "libopenspecfun.so.1()(64bit) libopenspecfun1 libopenspecfun1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
