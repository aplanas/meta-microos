SUMMARY = "Daemon-less container engine for managing containers, pods and images"
DESCRIPTION = "Podman is a container engine for managing pods, containers, and container \
images. \
It is a standalone tool and it directly manipulates containers without the need \
of a container engine daemon. \
Podman is able to interact with container images create in buildah, cri-o, and \
skopeo, as they all share the same datastore backend."
LICENSE = "Apache-2.0"

PV = "4.5.0"

RPM_NAME = "podman-4.5.0-1.1.aarch64.rpm"
RPM_HASH = "e368cfd8b8492d7a29d64831fdbd05b015fe0234991c376b5d584f861aa4294b5cbaf3eac66ee347b8b2ba40188bb165eb5010a576e9cc39e3a6a31bc4d92d54"

RPROVIDES:${PN} += "podman podman(aarch-64)"
RDEPENDS:${PN} += "(kmod(br_netfilter.ko) if kernel) /bin/sh catatonit cni cni-plugins conmon fuse-overlayfs iptables libc.so.6(GLIBC_2.34)(64bit) libcontainers-common libgpgme.so.11()(64bit) libgpgme.so.11(GPGME_1.0)(64bit) libgpgme.so.11(GPGME_1.1)(64bit) libseccomp.so.2()(64bit) runc slirp4netns timezone"

inherit rpm
