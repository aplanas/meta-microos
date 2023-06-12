SUMMARY = "Library That Implements Different Microsoft Compressions"
DESCRIPTION = "The purpose of libmspack is to provide both compression and \
decompression of some loosely related file formats used by Microsoft. \
Currently the most common formats are implemented. \
 \
This subpacke provides useful programs that make use of libmspack. \
 * cabd_memory - An implementation of the mspack_system interface using \
                 only memory \
 * cabrip      - Extracts any CAB files embedded in another file. \
 * chmextract  - Extracts all files in a CHM file to disk. \
 * msexpand    - Expands an SZDD or KWAJ file. \
 * multifh     - An implementation of the mspack_system interface which \
                 can access many things: regular disk files, already \
                 opened stdio FILE*  file pointers, open file \
                 descriptors, blocks of memory \
 * oabextract  - Extracts an Exchange Offline Address Book (.LZX) file."
LICENSE = "LGPL-2.1-only"

PV = "0.11"

RPM_NAME = "mspack-examples-0.11-1.3.aarch64.rpm"
RPM_HASH = "5416615783c8d1dfafde9a2f14bb84490e23d979e6892ffcc6414d4af310f0e547eb1b3301344328cc762e99574535029994c0d707c116be64367038206cf10f"

RPROVIDES:${PN} += "mspack-examples \
mspack-examples(aarch-64) \
mspack-tools"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmspack.so.0()(64bit)"

inherit rpm
