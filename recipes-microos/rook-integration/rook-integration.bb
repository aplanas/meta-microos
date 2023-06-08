SUMMARY = "Application which runs Rook integration tests"
DESCRIPTION = "This package is intended to be used only for testing. Please don't install it \
in production environments. \
 \
Rook's integration tests conveniently get built into a standalone binary. The \
tests require a running Kubernetes cluster, and the image being tested must be \
pushed to all Kubernetes cluster nodes as 'rook/ceph:master'. They also require \
that 'kubectl' works without additional connection arguments from the system \
which will run the binary. The integration tests can be flaky and are best run \
on a Kubernetes cluster which has not previously run the integration tests. \
 \
The list of possible integration test suites can be gotten from the integration \
binary with the argument [-test.list '.*']. A subset of test suites can be run \
by specifying a regular expression (or a specific test suite name) as an \
argument to [-test.run]. All Ceph test suites can be run with the argument \
[-test.run 'TestCeph']."
LICENSE = "Apache-2.0"

PV = "1.6.2+git0.ge8fd65f08"

RPM_NAME = "rook-integration-1.6.2+git0.ge8fd65f08-2.7.aarch64.rpm"
RPM_HASH = "392043f195875b2c8c16c2ba158735488413301c79be9855d84b514bd3cda44a9e8f179b2d6d839da26d15d69f6fdf37b5f96cce47a601a1cb90f8e494fd6d0e"

RPROVIDES:${PN} += "rook-integration rook-integration(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
