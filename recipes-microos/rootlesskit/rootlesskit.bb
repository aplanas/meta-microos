SUMMARY = "Linux-native fakeroot using user namespaces"
DESCRIPTION = "RootlessKit is a Linux-native implementation of 'fake root' \
using user_namespaces. RootlessKit is intended to run Docker and \
Kubernetes as an unprivileged user (known as 'Rootless mode'), so as to protect \
the real root on the host from potential container-breakout attacks."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "rootlesskit-1.1.0-2.3.aarch64.rpm"
RPM_HASH = "9c157c73d42e2c3694d97423196a7473ec137a9b04156afc95d88966b3cba8408b9c4a4bcb581ce65aa2079a90d2d1b45fd24dca035e0a89c7c0f0e6178511a5"

RPROVIDES:${PN} += "rootlesskit rootlesskit(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
