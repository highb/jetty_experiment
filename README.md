# jetty-experiment

A Clojure library designed to ... well, that part is up to you.

## Usage

```
➜  ~ lein run
<background or in separate term...>
➜  ~ curl -v localhost:8080
* Rebuilt URL to: localhost:8080/
*   Trying 127.0.0.1...
* TCP_NODELAY set
* Connected to localhost (127.0.0.1) port 8080 (#0)
> GET / HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.54.0
> Accept: */*
>
< HTTP/1.1 200 OK
< Date: Tue, 27 Nov 2018 18:12:32 GMT
< Content-Type: text/plain
< Content-Length: 11
< Server: Jetty(9.4.11.v20180605)
<
* Connection #0 to host localhost left intact
Hello World%
```


## License

Copyright © 2018 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
