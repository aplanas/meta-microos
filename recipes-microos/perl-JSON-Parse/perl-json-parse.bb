SUMMARY = "Parse JSON"
DESCRIPTION = "A module for parsing JSON. (JSON means 'JavaScript Object Notation' and it \
is specified in RFC 8259.) \
 \
JSON::Parse offers the function parse_json, which takes a string containing \
JSON, and returns an equivalent Perl structure. It also offers validation \
of JSON via valid_json, which returns true or false depending on whether \
the JSON is correct or not, and assert_valid_json, which produces a \
descriptive fatal error if the JSON is invalid. A function read_json reads \
JSON from a file, and there is a safer version of parse_json called \
parse_json_safe which doesn't throw exceptions. \
 \
For special cases of parsing, there are also methods new and parse, which \
create a JSON parsing object and run it on text. See METHODS. \
 \
JSON::Parse accepts only UTF-8 as input. See UTF-8 only and Handling of \
Unicode."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.62"

RPM_NAME = "perl-JSON-Parse-0.62-1.4.aarch64.rpm"
RPM_HASH = "7aeb04581af65ea91c2818bc8aa585e12a5dd6f49fbc6314b08f225162949bfb30edccafc577e21365c2ccec534bda6b3d18f30f9d320905c4767259e72f526c"

RPROVIDES:${PN} += "perl(JSON::Parse) perl(JSON::Tokenize) perl(JSON::Whitespace) perl-JSON-Parse perl-JSON-Parse(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
