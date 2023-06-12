SUMMARY = "Python bindings for pocketsphinx"
DESCRIPTION = "Pocketsphinx is a version of the open-source CMU Sphinx II speech \
recognition system which is able to recognize speech in real-time. \
 \
This package provides python bindings for pocketsphinx."
LICENSE = "BSD-2-Clause"

PV = "5~git20200227.e40da77"

RPM_NAME = "python3-pocketsphinx5-5~git20200227.e40da77-2.3.aarch64.rpm"
RPM_HASH = "2c47af5c1a703e324c5e7ec0d24504100935811ef3efac59437626699b7665006d973b8837dcba30fbf94295e05ced04f63a787963c17422d56ee1b3b0cc1803"

RPROVIDES:${PN} += "python3-pocketsphinx-python \
python3-pocketsphinx5 \
python3-pocketsphinx5(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpocketsphinx.so.3()(64bit) \
libsphinxbase.so.3()(64bit) \
pocketsphinx5 \
python(abi) \
python3-sphinxbase5"

inherit rpm
