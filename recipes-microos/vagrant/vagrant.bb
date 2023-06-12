SUMMARY = "Tool for building and distributing virtualized development environments"
DESCRIPTION = "Vagrant is a tool for building and distributing virtualized development \
environments."
LICENSE = "MIT"

PV = "2.3.4"

RPM_NAME = "vagrant-2.3.4-4.1.aarch64.rpm"
RPM_HASH = "6bd7b07685452707847d8417dc78b03b6b46abb0b845362ba0e4e6b618c0242fd1c1ec4eb380f80f3e73019dd42f7b0b392983932761fffa40ff4d778bf78821"

RPROVIDES:${PN} += "rpm_macro(gem_binary) \
rpm_macro(vagrant_dir) \
rpm_macro(vagrant_embedded_dir) \
rpm_macro(vagrant_plugin_cache) \
rpm_macro(vagrant_plugin_conf) \
rpm_macro(vagrant_plugin_dir) \
rpm_macro(vagrant_plugin_docdir) \
rpm_macro(vagrant_plugin_install) \
rpm_macro(vagrant_plugin_instdir) \
rpm_macro(vagrant_plugin_libdir) \
rpm_macro(vagrant_plugin_spec) \
rpm_macro(vagrant_rb_build_abi) \
rpm_macro(vagrant_rb_build_versions) \
rpm_macro(vagrant_rb_ruby_suffix) \
rubygem-vagrant \
vagrant \
vagrant(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/ruby.ruby3.2 \
bsdtar \
curl \
openssh \
rubygem(ruby:3.2.0:bcrypt_pbkdf:1) \
rubygem(ruby:3.2.0:childprocess:4.1) \
rubygem(ruby:3.2.0:ed25519:1.3) \
rubygem(ruby:3.2.0:erubi) \
rubygem(ruby:3.2.0:googleapis-common-protos-types:1) \
rubygem(ruby:3.2.0:grpc) \
rubygem(ruby:3.2.0:hashicorp-checkpoint:0.1) \
rubygem(ruby:3.2.0:i18n:1) \
rubygem(ruby:3.2.0:listen:3) \
rubygem(ruby:3.2.0:log4r:1.1) \
rubygem(ruby:3.2.0:mime-types:3) \
rubygem(ruby:3.2.0:net-scp:4) \
rubygem(ruby:3.2.0:net-sftp:4) \
rubygem(ruby:3.2.0:net-ssh:7) \
rubygem(ruby:3.2.0:rb-kqueue:0.2) \
rubygem(ruby:3.2.0:rexml:3) \
rubygem(ruby:3.2.0:rgl:0.5) \
rubygem(ruby:3.2.0:rubyzip:2) \
rubygem(ruby:3.2.0:vagrant_cloud:3.0) \
rubygem(ruby:3.2.0:winrm-elevated:1) \
rubygem(ruby:3.2.0:winrm-fs:1) \
rubygem(ruby:3.2.0:winrm:2) \
shadow"

inherit rpm
