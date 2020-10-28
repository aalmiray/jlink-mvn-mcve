# MCVE for MJLINK-42

## Build instructions

1. `$ git clone https://github.com/aalmiray/jlink-mvn-mcve` 
2. `$ cd jlink-mvn-mcve`
3. `$ mvn install`

The generated image will be available at `image/target/maven-jlink`.

Run the main class with

```sh
$ ./image/target/maven-jlink/bin/java --add-modules com.acme.modtwo com.acme.mod2.Main
```

## Reproduce the bug

1. Follow the build instructions above
2. `$ cd image`
3. `$ mvn install`
