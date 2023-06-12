SUMMARY = "YAML Ain't Markup Language™"
DESCRIPTION = "The YAML.pm module implements a YAML Loader and Dumper based on the YAML \
1.0 specification. http://www.yaml.org/spec/ \
 \
YAML is a generic data serialization language that is optimized for human \
readability. It can be used to express the data structures of most modern \
programming languages. (Including Perl!!!) \
 \
For information on the YAML syntax, please refer to the YAML specification."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.30"

RPM_NAME = "perl-YAML-1.30-1.13.noarch.rpm"
RPM_HASH = "3d023fd2b2e6a78e0259370c29b431e5fcded92a16a0ecc30439c0343b9e3f13090d5c3c63ae3a96c88b220372b5cc04a6ae6b076a4dbaad7d12b7518486884e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(YAML) \
perl(YAML::Any) \
perl(YAML::Dumper) \
perl(YAML::Dumper::Base) \
perl(YAML::Error) \
perl(YAML::Loader) \
perl(YAML::Loader::Base) \
perl(YAML::Marshall) \
perl(YAML::Mo) \
perl(YAML::Node) \
perl(YAML::Tag) \
perl(YAML::Type::blessed) \
perl(YAML::Type::code) \
perl(YAML::Type::glob) \
perl(YAML::Type::ref) \
perl(YAML::Type::regexp) \
perl(YAML::Type::undef) \
perl(YAML::Types) \
perl(YAML::Warning) \
perl(yaml_mapping) \
perl(yaml_scalar) \
perl(yaml_sequence) \
perl-YAML"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
