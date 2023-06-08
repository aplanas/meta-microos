SUMMARY = "A GNOME-Based Passphrase Dialog for OpenSSH"
DESCRIPTION = "SSH (Secure Shell) is a program for logging into a remote machine and \
for executing commands on a remote machine. This package contains a \
GNOME-based passphrase dialog for OpenSSH."
LICENSE = "BSD-2-Clause"

PV = "8.9p1"

RPM_NAME = "openssh-askpass-gnome-8.9p1-9.1.aarch64.rpm"
RPM_HASH = "82f7a8f4b7a460386eedc863365e7b56fa1431524b5f7715a112f8ac157c63eb9290d9f929fd5756d989d2ce67df5139212b1d9e74654347e6d0bac9eebec06b"

RPROVIDES:${PN} += "openssh-askpass-gnome openssh-askpass-gnome(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdk-3.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) openssh"

inherit rpm
