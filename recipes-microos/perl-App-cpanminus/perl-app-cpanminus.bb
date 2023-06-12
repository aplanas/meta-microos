SUMMARY = "Get, unpack, build and install modules from CPAN"
DESCRIPTION = "cpanminus is a script to get, unpack, build and install modules from CPAN \
and does nothing else. \
 \
It's dependency free (can bootstrap itself), requires zero configuration, \
and stands alone. When running, it requires only 10MB of RAM."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.7046"

RPM_NAME = "perl-App-cpanminus-1.7046-1.6.noarch.rpm"
RPM_HASH = "dfaaba4916f2c6e712395301d0797a18811a6b9cd23b3f6761e2812af17377f0d1227322bbbb17b0509696ede496ff33204488eabef5d13dc5867dde223926c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpanm \
perl(App::cpanminus) \
perl(App::cpanminus::Dependency) \
perl(App::cpanminus::fatscript) \
perl(App::cpanminus::script) \
perl(ModuleBuildSkipMan) \
perl-App-cpanminus"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(CPAN::DistnameInfo) \
perl(CPAN::Meta) \
perl(CPAN::Meta::Check) \
perl(CPAN::Meta::Prereqs) \
perl(CPAN::Meta::YAML) \
perl(Digest::SHA) \
perl(ExtUtils::Install) \
perl(ExtUtils::MakeMaker) \
perl(ExtUtils::Manifest) \
perl(File::pushd) \
perl(HTTP::Tiny) \
perl(Module::Build) \
perl(Module::CPANfile) \
perl(Module::CoreList) \
perl(Module::Metadata) \
perl(Parse::PMFile) \
perl(String::ShellQuote) \
perl(YAML) \
perl(local::lib)"

inherit rpm
