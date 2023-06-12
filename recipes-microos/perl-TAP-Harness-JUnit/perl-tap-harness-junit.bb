SUMMARY = "Generate JUnit compatible output from TAP results"
DESCRIPTION = "The only difference between this module and _TAP::Harness_ is that this \
module adds the optional arguments 'xmlfile', 'package', and 'namemangle' \
that cause the output to be formatted into XML in a format similar to the \
one that is produced by the JUnit testing framework."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.42"

RPM_NAME = "perl-TAP-Harness-JUnit-0.42-1.15.noarch.rpm"
RPM_HASH = "b56e003ed6ded64817dd8035f9ce4783397409e90b5a276e9dff6d229da81c668a8d07dfbb8997c49b6615c3c98d28195a1be23ffb5e74883dfe8381b082a433"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(TAP::Harness::JUnit) \
perl(TAP::Harness::JUnit::Parser) \
perl-TAP-Harness-JUnit"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(TAP::Harness) \
perl(TAP::Parser) \
perl(XML::Simple)"

inherit rpm
