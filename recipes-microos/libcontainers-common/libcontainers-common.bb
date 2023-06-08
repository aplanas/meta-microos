SUMMARY = "Configuration files common to github.com/containers"
DESCRIPTION = "Configuration files and manpages shared by tools that are based on the \
github.com/containers libraries, such as Buildah, CRI-O, Podman and Skopeo."
LICENSE = "Apache-2.0"

PV = "20230214"

RPM_NAME = "libcontainers-common-20230214-4.1.noarch.rpm"
RPM_HASH = "98c38bf333c0218d2f654c8e294200083fa51fa0606ed55ff3a5c3f325fd46d2ac74fe08cba3cd493cf181ddbb7ebaad490450a709f928552b292bba0d44fd4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(libcontainers-common) libcontainers-common libcontainers-image libcontainers-storage"
RDEPENDS:${PN} += "/bin/sh /usr/bin/grep /usr/bin/sed"

inherit rpm
