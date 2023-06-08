SUMMARY = "a fast and extensible eRuby implementation which supports"
DESCRIPTION = "Erubis is an implementation of eRuby and has the following features: \
* Very fast, almost three times faster than ERB and about 10% faster than \
eruby. \
* Multi-language support (Ruby/PHP/C/Java/Scheme/Perl/Javascript) \
* Auto escaping support \
* Auto trimming spaces around '<% %>' \
* Embedded pattern changeable (default '<% %>') \
* Enable to handle Processing Instructions (PI) as embedded pattern (ex. '<?rb \
... ?>') \
* Context object available and easy to combine eRuby template with YAML \
datafile \
* Print statement available \
* Easy to extend and customize in subclass \
* Ruby on Rails support."
LICENSE = "MIT"

PV = "2.7.0"

RPM_NAME = "ruby3.2-rubygem-erubis-2.7.0-6.34.aarch64.rpm"
RPM_HASH = "e0e8a85764de1843317449d89b08589881c5ee902da0ea9b6f4b004eee77302867095c0fa45e89a9acf891f7c9eeb965bb49a8317846486c26f8c6c9f3b7917f"

RPROVIDES:${PN} += "ruby3.2-rubygem-erubis ruby3.2-rubygem-erubis(aarch-64) rubygem(erubis) rubygem(ruby:3.2.0:erubis) rubygem(ruby:3.2.0:erubis:2) rubygem(ruby:3.2.0:erubis:2.7) rubygem(ruby:3.2.0:erubis:2.7.0)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/ruby.ruby3.2 ruby(abi) update-alternatives"

inherit rpm
