SUMMARY = "Secure Shell Client and Server (Remote Login Program)"
DESCRIPTION = "SSH (Secure Shell) is a program for logging into and executing commands \
on a remote machine. It replaces rsh (rlogin and rsh) and \
provides secure encrypted communication between two untrusted \
hosts over an insecure network. \
 \
xorg-x11 (X Window System) connections and arbitrary TCP/IP ports can \
also be forwarded over the secure channel. \
 \
This is a dummy package that pulls in both the client and server \
components."
LICENSE = "BSD-2-Clause & MIT"

PV = "8.9p1"

RPM_NAME = "openssh-8.9p1-9.1.aarch64.rpm"
RPM_HASH = "e681c177c20b5bd082e25c2d0a8c2c7de72f2088f9af6885325b5b51152a037744101317dd9906acff7f03faafb6703d0ceb5eaca129d0db94de56d1b4dfb676"

RPROVIDES:${PN} += "openssh openssh(aarch-64)"
RDEPENDS:${PN} += "findutils grep openssh-clients openssh-server"

inherit rpm
