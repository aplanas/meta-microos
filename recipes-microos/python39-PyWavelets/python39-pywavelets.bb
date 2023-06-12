SUMMARY = "PyWavelets is a Python wavelet transforms module"
DESCRIPTION = "PyWavelets is a Python wavelet transforms module that can do: \
 \
  * 1D and 2D Forward and Inverse Discrete Wavelet Transform (DWT and IDWT) \
  * 1D and 2D Stationary Wavelet Transform (Undecimated Wavelet Transform) \
  * 1D and 2D Wavelet Packet decomposition and reconstruction \
  * Computing Approximations of wavelet and scaling functions \
  * Over seventy built-in wavelet filters and support for custom wavelets \
  * Single and double precision calculations \
  * Results compatibility with Matlab Wavelet Toolbox"
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python39-PyWavelets-1.4.1-1.5.aarch64.rpm"
RPM_HASH = "1dbfc242ab1eda73ed26ff1500ede6bf13fed738e1e2d365a7da24db761771475981283733f1d6abdd8404e2a40d1926de5baab75996d0c3e3e2a50cda16f272"

RPROVIDES:${PN} += "python3.9dist(pywavelets) \
python39-PyWavelets \
python39-PyWavelets(aarch-64) \
python39-PyWavelets-doc \
python3dist(pywavelets)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python39-numpy"

inherit rpm
