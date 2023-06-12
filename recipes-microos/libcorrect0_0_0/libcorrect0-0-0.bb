SUMMARY = "C library for Convolutional codes and Reed-Solomon"
DESCRIPTION = "libcorrect is a library for Forward Error Correction. By using libcorrect, \
extra redundancy can be encoded into a packet of data and then be sent \
across a lossy channel. When the packet is received, it can be decoded to \
recover the original, pre-encoded data. \
 \
libcorrect accomplishes this task with two algorithms, Convolutional codes \
and Reed-Solomon. Convolutional codes are robust to a constant background \
noise, while Reed-Solomon error correction is effective at dealing with \
noise that occurs in bursts. These algorithms have played an important role \
in telecommunications. libcorrect uses a Viterbi algorithm decoder to decode \
convolutional codes."
LICENSE = "BSD-3-Clause"

PV = "0.0.0+git.20180109"

RPM_NAME = "libcorrect0_0_0-0.0.0+git.20180109-3.8.aarch64.rpm"
RPM_HASH = "f824fa279150cfdc1afa77af90b6253f5003574e63ebc55ac23c6d1b09118bf09960c3ecb0a7c7f4c48120e87ea55dc45acd5c48e85a1214755a37fc28f3422a"

RPROVIDES:${PN} += "libcorrect.so.0.0.0()(64bit) \
libcorrect0_0_0 \
libcorrect0_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
