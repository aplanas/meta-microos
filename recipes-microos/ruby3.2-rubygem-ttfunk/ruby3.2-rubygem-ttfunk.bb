SUMMARY = "TrueType Font Metrics Parser"
DESCRIPTION = "Font Metrics Parser for the Prawn PDF generator."
LICENSE = "Ruby | GPL-2.0-only | GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "ruby3.2-rubygem-ttfunk-1.7.0-1.13.aarch64.rpm"
RPM_HASH = "a536cc954e7f1cf398f9e32cfac0e1914645e589b48d4950e90e15ae4ce0085a87f8697bcc0473355af43c128b52c7231cdbe54f9d5c94978518185ff6d5e3e8"

RPROVIDES:${PN} += "ruby3.2-rubygem-ttfunk ruby3.2-rubygem-ttfunk(aarch-64) rubygem(ruby:3.2.0:ttfunk) rubygem(ruby:3.2.0:ttfunk:1) rubygem(ruby:3.2.0:ttfunk:1.7) rubygem(ruby:3.2.0:ttfunk:1.7.0) rubygem(ttfunk)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
