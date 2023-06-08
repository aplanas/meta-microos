SUMMARY = "Tools to support Yubico's USB key low-level C library"
DESCRIPTION = "Binary tools to support Yubico's Low-level library for decrypting and \
parsing Yubikey One-Time Passwords (OTP) in C."
LICENSE = "BSD-2-Clause"

PV = "1.13"

RPM_NAME = "libyubikey-tools-1.13-3.23.aarch64.rpm"
RPM_HASH = "5295601038c5d669376f8248571eb0eb3783244faf14a48cf9111eee1a33834f77a6926607dcbe468a97f31921b1c23879ce414ef502f0503819d3e06cdfb356"

RPROVIDES:${PN} += "libyubikey-tools libyubikey-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libyubikey.so.0()(64bit) libyubikey.so.0(YUBIKEY_1.0)(64bit) libyubikey.so.0(YUBIKEY_1.6)(64bit)"

inherit rpm
