SUMMARY = "Vagrant provider for libvirt"
DESCRIPTION = "This is a Vagrant plugin that adds a Libvirt provider to Vagrant, allowing \
Vagrant to control and provision machines via the Libvirt toolkit."
LICENSE = "MIT"

PV = "0.11.2"

RPM_NAME = "vagrant-libvirt-0.11.2-2.2.aarch64.rpm"
RPM_HASH = "f394f3944a0a16934da1e9a6e0f6c5ce5631e7dd86b10c2cf9253553c1c571b70827fb684f993d8f4016d789ab24da4d39ada4a5459f96e8de00e3838e96aa0b"

RPROVIDES:${PN} += "vagrant-libvirt \
vagrant-libvirt(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
libvirt \
qemu-arm \
rubygem(ruby:3.2.0:diffy) \
rubygem(ruby:3.2.0:fog-core:2) \
rubygem(ruby:3.2.0:fog-libvirt) \
rubygem(ruby:3.2.0:nokogiri:1) \
rubygem(ruby:3.2.0:rexml) \
rubygem(ruby:3.2.0:xml-simple) \
vagrant"

inherit rpm
