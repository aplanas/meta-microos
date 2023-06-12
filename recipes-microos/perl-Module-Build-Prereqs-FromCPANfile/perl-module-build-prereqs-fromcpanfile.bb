SUMMARY = "Construct prereq parameters of Module::Build from cpanfile"
DESCRIPTION = "This simple module reads cpanfile and converts its content into valid \
prereq parameters for 'new()' method of Module::Build. \
 \
Currently it does not support 'optional features' specification (See \
cpanfile/feature)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.02"

RPM_NAME = "perl-Module-Build-Prereqs-FromCPANfile-0.02-1.11.noarch.rpm"
RPM_HASH = "bc9fa936f924d7268598c957bf85aa3a02485c27175ec0e0f27fe42f731a567ce785203b19d56ef9544e6e95366b2bfdf04e01103c258a0bdb6259b206dc5f46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Module::Build::Prereqs::FromCPANfile) \
perl-Module-Build-Prereqs-FromCPANfile"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(CPAN::Meta::Prereqs) \
perl(Module::CPANfile) \
perl(version)"

inherit rpm
