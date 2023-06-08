SUMMARY = "Kernel.org Uploader - client"
DESCRIPTION = "Kup is a file upload utility for kernel.org. It is designed to only accept \
cryptographically verified uploads from pre-authorized, trusted members."
LICENSE = "GPL-2.0+"

PV = "0.3.6"

RPM_NAME = "kup-client-0.3.6-1.14.aarch64.rpm"
RPM_HASH = "c6fa041f438f7cdc0f7fffd704639834aae4956f25f9e27b45a2739a40fd794763d0d99c8fd6ebcd362054d15d8b23728d536906865dcff07d8ab4e12e876138"

RPROVIDES:${PN} += "kup-client kup-client(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl perl perl(Config::Simple) perl(Encode) perl(File::Spec)"

inherit rpm
